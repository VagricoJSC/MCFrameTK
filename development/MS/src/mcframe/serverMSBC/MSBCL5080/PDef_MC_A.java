package mcframe.serverMSBC.MSBCL5080;

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
 * [MSBCL_RqmtCrtService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL5080.RqmtCrt_Upd01.UP.BLOCK0")){
			return MS_MSBCL5080_RqmtCrt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5080.RqmtCrt_Calc01.UP.BLOCK0")){
			return MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5080.RqmtCrt_Calc01.UP.BLOCK1")){
			return MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5080.RqmtCrt_Calc01.UP.BLOCK2")){
			return MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL5080.RqmtCrt_Calc01.DOWN.BLOCK0")){
			return MS_MSBCL5080_RqmtCrt_Calc01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBCL5080_RqmtCrt_Upd01_INFO = new MCOperationInfo("MS", "MSBCL5080", "RqmtCrt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5080_RqmtCrt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5080", "RqmtCrt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("RqmtCrt_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5080_RqmtCrt_Calc01_INFO = new MCOperationInfo("MS", "MSBCL5080", "RqmtCrt_Calc01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5080", "RqmtCrt_Calc01",
			new MCItemDef[]{
				MCItemDef.create("ac_cl_day", "ac_cl_day"),
				MCItemDef.create("ac_cl_mon_base", "ac_cl_mon_base")
			}
			,
			MCBlockDef.create("RqmtCrt_Calc01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5080", "RqmtCrt_Calc01",
			new MCItemDef[]{
				MCItemDef.create("pln_ym", "pln_ym"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("strg_loc_cal_cd", "strg_loc_cal_cd"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("prod_qty_by_day", "prod_qty_by_day"),
				MCItemDef.create("prod_rate", "prod_rate"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("prod_begin_day", "prod_begin_day"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("date_div_mons", "date_div_mons"),
				MCItemDef.create("week_div_mons", "week_div_mons"),
				MCItemDef.create("period_div_mons", "period_div_mons"),
				MCItemDef.create("rqmt_mons", "rqmt_mons"),
				MCItemDef.create("prcd_mons", "prcd_mons"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("mfg_loc_sppl_cd", "mfg_loc_sppl_cd"),
				MCItemDef.create("date_div_typ", "date_div_typ")
			}
			,
			MCBlockDef.create("RqmtCrt_Calc01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBCL5080_RqmtCrt_Calc01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL5080", "RqmtCrt_Calc01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd")
			}
			,
			MCBlockDef.create("RqmtCrt_Calc01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBCL5080_RqmtCrt_Calc01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5080", "RqmtCrt_Calc01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("mfg_loc_sppl_cd", "mfg_loc_sppl_cd")
			}
			,
			MCBlockDef.create("RqmtCrt_Calc01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

