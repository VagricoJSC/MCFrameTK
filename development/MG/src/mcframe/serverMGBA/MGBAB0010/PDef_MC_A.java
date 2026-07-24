package mcframe.serverMGBA.MGBAB0010;

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
 * [MGBAB_PlnIfBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBAB0010.PlnIf_Upd01.UP.BLOCK0")){
			return MG_MGBAB0010_PlnIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAB0010.PlnIf_Upd02.UP.BLOCK0")){
			return MG_MGBAB0010_PlnIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAB0010.PlnIf_Upd03.UP.BLOCK0")){
			return MG_MGBAB0010_PlnIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAB0010.PlnIf_Upd04.UP.BLOCK0")){
			return MG_MGBAB0010_PlnIf_Upd04_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MG_MGBAB0010_PlnIf_Upd01_INFO = new MCOperationInfo("MG", "MGBAB0010", "PlnIf_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBAB0010_PlnIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAB0010", "PlnIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("sls_pln_imp_typ", "sls_pln_imp_typ")
			}
			,
			MCBlockDef.create("PlnIf_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAB0010_PlnIf_Upd02_INFO = new MCOperationInfo("MG", "MGBAB0010", "PlnIf_Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBAB0010_PlnIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAB0010", "PlnIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("rqmt_pln_imp_typ", "rqmt_pln_imp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("PlnIf_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAB0010_PlnIf_Upd03_INFO = new MCOperationInfo("MG", "MGBAB0010", "PlnIf_Upd03", "000000", new PDef());

	public static MCContainerDef MG_MGBAB0010_PlnIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAB0010", "PlnIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mfg_pln_imp_typ", "mfg_pln_imp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("PlnIf_Upd03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAB0010_PlnIf_Upd04_INFO = new MCOperationInfo("MG", "MGBAB0010", "PlnIf_Upd04", "000000", new PDef());

	public static MCContainerDef MG_MGBAB0010_PlnIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAB0010", "PlnIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("purc_pln_imp_typ", "purc_pln_imp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("PlnIf_Upd04_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

