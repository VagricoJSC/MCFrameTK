package mcframe.serverMSBE.MSBEL0140;

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
 * [MSBEL_StkLumpAlloc]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0140.Chk01.UP.BLOCK0")){
			return MS_MSBEL0140_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0140.Chk01.UP.BLOCK1")){
			return MS_MSBEL0140_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0140.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL0140_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0140.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL0140_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0140.Upd01.UP.BLOCK0")){
			return MS_MSBEL0140_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0140.Upd01.UP.BLOCK1")){
			return MS_MSBEL0140_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0140.Upd02.UP.BLOCK0")){
			return MS_MSBEL0140_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0140.Upd02.UP.BLOCK1")){
			return MS_MSBEL0140_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0140.Upd02.DOWN.BLOCK0")){
			return MS_MSBEL0140_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL0140_Chk01_INFO = new MCOperationInfo("MS", "MSBEL0140", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0140_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("cst_slct_typ", "cst_slct_typ")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL0140_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL0140_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("cst_slct_typ", "cst_slct_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL0140_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0140_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0140", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0140_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("cst_slct_typ", "cst_slct_typ"),
				MCItemDef.create("cnt", "cnt")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL0140_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0140_Upd02_INFO = new MCOperationInfo("MS", "MSBEL0140", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0140_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_dt_fr", "ship_schd_dt_fr"),
				MCItemDef.create("ship_schd_hm_fr", "ship_schd_hm_fr"),
				MCItemDef.create("ship_schd_dt_to", "ship_schd_dt_to"),
				MCItemDef.create("ship_schd_hm_to", "ship_schd_hm_to"),
				MCItemDef.create("ship_schd_tm_prio_flg", "ship_schd_tm_prio_flg"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("cst_slct_typ", "cst_slct_typ")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL0140_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL0140_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0140", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("all_alloc_cnt", "all_alloc_cnt"),
				MCItemDef.create("part_alloc_cnt", "part_alloc_cnt"),
				MCItemDef.create("non_alloc_cnt", "non_alloc_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

