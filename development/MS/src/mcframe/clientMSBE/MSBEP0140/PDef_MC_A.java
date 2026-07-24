package mcframe.clientMSBE.MSBEP0140;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_StkLumpAlloc]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0140.Upd01.UP.BLOCK0")){
			return MS_MSBEL0140_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0140.Upd01.UP.BLOCK1")){
			return MS_MSBEL0140_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL0140_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0140", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0140_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_dt_p" + ".ymd_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_dt_p" + ".hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_dt_p" + ".hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("cst_slct_typ", "cst_slct_typ"),
				MCItemDef.IGNORE_ITEM("cnt")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL0140_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

