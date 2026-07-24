package mcframe.serverMGBA.MGBAL0200;

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
 * [MGBAL_ActPlnCopy]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBAL0200.Chk01.UP.BLOCK0")){
			return MG_MGBAL0200_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0200.Chk01.UP.BLOCK1")){
			return MG_MGBAL0200_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBAL0200.Ins01.UP.BLOCK0")){
			return MG_MGBAL0200_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0200.Chk02.UP.BLOCK0")){
			return MG_MGBAL0200_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0200.Chk02.UP.BLOCK1")){
			return MG_MGBAL0200_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBAL0200.Ins02.UP.BLOCK0")){
			return MG_MGBAL0200_Ins02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MG_MGBAL0200_Chk01_INFO = new MCOperationInfo("MG", "MGBAL0200", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0200_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("act_ym_fr", "act_ym_fr"),
				MCItemDef.create("act_ym_to", "act_ym_to"),
				MCItemDef.create("pln_calc_ctg_cd", "pln_calc_ctg_cd"),
				MCItemDef.create("pln_ym_fr", "pln_ym_fr"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("inpt_flg", "inpt_flg"),
				MCItemDef.create("itm_wk_flg", "itm_wk_flg"),
				MCItemDef.create("other_wk_flg", "other_wk_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("amt_flg_str", "amt_flg_str"),
				MCItemDef.create("trd_amt_flg_str", "trd_amt_flg_str")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBAL0200_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd")
			}
			,
			MCBlockDef.create("Chk01_Cnd2")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0200_Ins01_INFO = new MCOperationInfo("MG", "MGBAL0200", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0200_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("act_ym_fr", "act_ym_fr"),
				MCItemDef.create("act_ym_to", "act_ym_to"),
				MCItemDef.create("pln_calc_ctg_cd", "pln_calc_ctg_cd"),
				MCItemDef.create("pln_ym_fr", "pln_ym_fr"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("inpt_flg", "inpt_flg"),
				MCItemDef.create("itm_wk_flg", "itm_wk_flg"),
				MCItemDef.create("other_wk_flg", "other_wk_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("amt_flg_str", "amt_flg_str"),
				MCItemDef.create("trd_amt_flg_str", "trd_amt_flg_str")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0200_Chk02_INFO = new MCOperationInfo("MG", "MGBAL0200", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0200_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("act_ym_fr", "act_ym_fr"),
				MCItemDef.create("act_ym_to", "act_ym_to"),
				MCItemDef.create("pln_calc_ctg_cd", "pln_calc_ctg_cd"),
				MCItemDef.create("pln_ym_fr", "pln_ym_fr"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("inpt_flg", "inpt_flg"),
				MCItemDef.create("itm_wk_flg", "itm_wk_flg"),
				MCItemDef.create("other_wk_flg", "other_wk_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("amt_flg_str", "amt_flg_str"),
				MCItemDef.create("trd_amt_flg_str", "trd_amt_flg_str")
			}
			,
			MCBlockDef.create("Chk02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBAL0200_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd")
			}
			,
			MCBlockDef.create("Chk02_Cnd2")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0200_Ins02_INFO = new MCOperationInfo("MG", "MGBAL0200", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0200_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0200", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("act_ym_fr", "act_ym_fr"),
				MCItemDef.create("act_ym_to", "act_ym_to"),
				MCItemDef.create("pln_calc_ctg_cd", "pln_calc_ctg_cd"),
				MCItemDef.create("pln_ym_fr", "pln_ym_fr"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("inpt_flg", "inpt_flg"),
				MCItemDef.create("itm_wk_flg", "itm_wk_flg"),
				MCItemDef.create("other_wk_flg", "other_wk_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("amt_flg_str", "amt_flg_str"),
				MCItemDef.create("trd_amt_flg_str", "trd_amt_flg_str")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

