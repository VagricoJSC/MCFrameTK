package mcframe.serverMSBE.MSBEB0050;

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
 * [MSBEB_ShipStkRplBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEB0050.ShipStkRplBatch_Upd01.UP.BLOCK0")){
			return MS_MSBEB0050_ShipStkRplBatch_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0050.ShipStkRplBatch_Del01.UP.BLOCK0")){
			return MS_MSBEB0050_ShipStkRplBatch_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEB0050_ShipStkRplBatch_Upd01_INFO = new MCOperationInfo("MS", "MSBEB0050", "ShipStkRplBatch_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0050_ShipStkRplBatch_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0050", "ShipStkRplBatch_Upd01",
			new MCItemDef[]{
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("xfr_schd_crt_flg", "xfr_schd_crt_flg"),
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("slo_flg", "slo_flg"),
				MCItemDef.create("prms_flg", "prms_flg"),
				MCItemDef.create("dlv_inst_flg", "dlv_inst_flg"),
				MCItemDef.create("ord_flg", "ord_flg"),
				MCItemDef.create("tm_fr", "tm_fr"),
				MCItemDef.create("tm_to", "tm_to"),
				MCItemDef.create("not_alloc_flg", "not_alloc_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("ShipStkRplBatch_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEB0050_ShipStkRplBatch_Del01_INFO = new MCOperationInfo("MS", "MSBEB0050", "ShipStkRplBatch_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0050_ShipStkRplBatch_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0050", "ShipStkRplBatch_Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_stk_rpl_lst_del_flg", "ship_stk_rpl_lst_del_flg"),
				MCItemDef.create("xfr_schd_del_flg", "xfr_schd_del_flg"),
				MCItemDef.create("tm_fr", "tm_fr"),
				MCItemDef.create("tm_to", "tm_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("ShipStkRplBatch_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

