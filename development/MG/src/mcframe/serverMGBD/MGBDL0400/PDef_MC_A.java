package mcframe.serverMGBD.MGBDL0400;

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
 * [MGBDL_CostItmInfoCopy]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0400.Chk01.UP.BLOCK0")){
			return MG_MGBDL0400_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0400.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0400_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0400.Chk02.UP.BLOCK0")){
			return MG_MGBDL0400_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0400.Ins01.UP.BLOCK0")){
			return MG_MGBDL0400_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0400.Del01.UP.BLOCK0")){
			return MG_MGBDL0400_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MG_MGBDL0400_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0400", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0400_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bom_flg", "bom_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("proc_flg", "proc_flg"),
				MCItemDef.create("prov_flg", "prov_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("sls_upri_imp_typ", "sls_upri_imp_typ")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0400_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0400", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bom_flg", "bom_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("proc_flg", "proc_flg"),
				MCItemDef.create("prov_flg", "prov_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("sls_upri_imp_typ", "sls_upri_imp_typ")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0400_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0400", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0400_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0400", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
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
			MCBlockDef.create("Chk02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0400_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0400", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0400_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0400", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bom_flg", "bom_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("proc_flg", "proc_flg"),
				MCItemDef.create("prov_flg", "prov_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("sls_upri_imp_typ", "sls_upri_imp_typ")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0400_Del01_INFO = new MCOperationInfo("MG", "MGBDL0400", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0400_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0400", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
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
			MCBlockDef.create("Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

