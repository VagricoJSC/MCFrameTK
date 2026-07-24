package mcframe.serverMSBD.MSBDB0020;

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
 * [MSBDB_PoBulkRegBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDB0020.PoBulkRegBatch_Ins01.UP.BLOCK0")){
			return MS_MSBDB0020_PoBulkRegBatch_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBDB0020_PoBulkRegBatch_Ins01_INFO = new MCOperationInfo("MS", "MSBDB0020", "PoBulkRegBatch_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDB0020_PoBulkRegBatch_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDB0020", "PoBulkRegBatch_Ins01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd_dt_fr", "po_schd_dt_fr"),
				MCItemDef.create("po_schd_dt_to", "po_schd_dt_to"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("skip_err_flg", "skip_err_flg"),
				MCItemDef.create("calc_schd_dt_flg", "calc_schd_dt_flg")
			}
			,
			MCBlockDef.create("PoBulkRegBatch_Ins01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

