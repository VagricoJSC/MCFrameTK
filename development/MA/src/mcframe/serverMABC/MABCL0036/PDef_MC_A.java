package mcframe.serverMABC.MABCL0036;

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
 * [MABCL_MultiReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0036.GpAlc_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlc_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.GpAlc_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.GpAlcLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlcLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.GpAlcLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlcLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.GpAlc_DelChk01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlc_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.GpAlc_Del01.UP.BLOCK0")){
			return MA_MABCL0036_GpAlc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtg_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtg_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtg_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtgLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtgLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtgLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtgLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtg_DelChk01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtg_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CalcCtg_Del01.UP.BLOCK0")){
			return MA_MABCL0036_CalcCtg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.RptPtn_Del01.UP.BLOCK0")){
			return MA_MABCL0036_RptPtn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenu_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenu_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenu_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenu_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenuLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenuLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenuLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenuLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenu_DelChk01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenu_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.CostMenu_Del01.UP.BLOCK0")){
			return MA_MABCL0036_CostMenu_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCo_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCo_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCo_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCo_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCoLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCoLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCoLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCoLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCo_DelChk01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCo_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0036.SiteCo_Del01.UP.BLOCK0")){
			return MA_MABCL0036_SiteCo_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																														
	
	static final MCOperationInfo MA_MABCL0036_GpAlc_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlc_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlc_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlc_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("gp_alc_nm", "gp_alc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlc_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_GpAlc_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("gp_alc_nm", "gp_alc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlc_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_GpAlcLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlcLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlcLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlcLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("gp_alc_nm", "gp_alc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlcLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_GpAlcLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlcLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlcLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlcLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("gp_alc_nm", "gp_alc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlcLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_GpAlc_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlc_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlc_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlc_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlc_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_GpAlc_Del01_INFO = new MCOperationInfo("MA", "MABCL0036", "GpAlc_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_GpAlc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "GpAlc_Del01",
			new MCItemDef[]{
				MCItemDef.create("gp_alc_cd", "gp_alc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpAlc_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtg_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtg_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtg_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtg_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtg_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtg_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtg_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtg_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtgLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtgLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtgLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtgLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtgLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtgLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtgLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtgLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtgLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtgLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtg_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtg_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtg_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtg_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtg_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CalcCtg_Del01_INFO = new MCOperationInfo("MA", "MABCL0036", "CalcCtg_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CalcCtg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CalcCtg_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcCtg_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_RptPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL0036", "RptPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_RptPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "RptPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("RptPtn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenu_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenu_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenu_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenu_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("menu_nm", "menu_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenu_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenu_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenu_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenu_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenu_Upd01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("menu_nm", "menu_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenu_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenuLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenuLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenuLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenuLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("menu_nm", "menu_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenuLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenuLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenuLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenuLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenuLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("menu_nm", "menu_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenuLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenu_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenu_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenu_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenu_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenu_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_CostMenu_Del01_INFO = new MCOperationInfo("MA", "MABCL0036", "CostMenu_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_CostMenu_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "CostMenu_Del01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostMenu_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCo_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCo_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCo_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCo_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("site_co_nm", "site_co_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCo_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCo_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCo_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCo_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("site_co_nm", "site_co_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCo_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCoLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCoLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCoLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCoLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("site_co_nm", "site_co_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCoLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCoLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCoLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCoLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCoLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("site_co_nm", "site_co_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCoLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCo_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCo_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCo_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCo_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCo_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0036_SiteCo_Del01_INFO = new MCOperationInfo("MA", "MABCL0036", "SiteCo_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0036_SiteCo_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0036", "SiteCo_Del01",
			new MCItemDef[]{
				MCItemDef.create("site_co_cd", "site_co_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("SiteCo_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

