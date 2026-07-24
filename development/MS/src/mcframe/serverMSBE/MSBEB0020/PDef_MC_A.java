package mcframe.serverMSBE.MSBEB0020;

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
 * [MSBEB_StkReallocBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEB0020.StkRealloc_Upd01.UP.BLOCK0")){
			return MS_MSBEB0020_StkRealloc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0020.StkRealloc_Upd02.UP.BLOCK0")){
			return MS_MSBEB0020_StkRealloc_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0020.StkRealloc_Upd02.DOWN.BLOCK0")){
			return MS_MSBEB0020_StkRealloc_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEB0020_StkRealloc_Upd01_INFO = new MCOperationInfo("MS", "MSBEB0020", "StkRealloc_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0020_StkRealloc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0020", "StkRealloc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg")
			}
			,
			MCBlockDef.create("StkRealloc_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEB0020_StkRealloc_Upd02_INFO = new MCOperationInfo("MS", "MSBEB0020", "StkRealloc_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0020_StkRealloc_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0020", "StkRealloc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg")
			}
			,
			MCBlockDef.create("StkRealloc_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEB0020_StkRealloc_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0020", "StkRealloc_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("all_alloc_cnt", "all_alloc_cnt"),
				MCItemDef.create("part_alloc_cnt", "part_alloc_cnt"),
				MCItemDef.create("non_alloc_cnt", "non_alloc_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("StkRealloc_Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

