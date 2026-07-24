package mcframe.clientMGBB.MGBBP0400;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBBP_ActItmCopyReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0400.Ins01.UP.BLOCK0")){
			return MG_MGBBL0400_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBBL0400_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0400", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0400_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("ptn_set_typ", "ptn_set_typ"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bom_flg", "bom_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("proc_flg", "proc_flg"),
				MCItemDef.create("prov_flg", "prov_flg"),
				MCItemDef.create("sls_flg", "sls_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

