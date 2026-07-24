package mcframe.serverMGBD.MGBDL5420;

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
 * [MGBDL_CopyBomService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL5420.CopyBom_Ins01.UP.BLOCK0")){
			return MG_MGBDL5420_CopyBom_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5420.CopyBom_Upd01.UP.BLOCK0")){
			return MG_MGBDL5420_CopyBom_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5420.CopyBom_Upd02.UP.BLOCK0")){
			return MG_MGBDL5420_CopyBom_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBDL5420_CopyBom_Ins01_INFO = new MCOperationInfo("MG", "MGBDL5420", "CopyBom_Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5420_CopyBom_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5420", "CopyBom_Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("lump_flg", "lump_flg"),
				MCItemDef.create("imp_ope_typ", "imp_ope_typ")
			}
			,
			MCBlockDef.create("CopyBom_Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL5420_CopyBom_Upd01_INFO = new MCOperationInfo("MG", "MGBDL5420", "CopyBom_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5420_CopyBom_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5420", "CopyBom_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3")
			}
			,
			MCBlockDef.create("CopyBom_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL5420_CopyBom_Upd02_INFO = new MCOperationInfo("MG", "MGBDL5420", "CopyBom_Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5420_CopyBom_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5420", "CopyBom_Upd02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("term", "term")
			}
			,
			MCBlockDef.create("CopyBom_Upd02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

