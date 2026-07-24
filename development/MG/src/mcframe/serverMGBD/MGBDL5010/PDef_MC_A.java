package mcframe.serverMGBD.MGBDL5010;

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
 * [MGBDL_CalcCostService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL5010.CalcCost_Ins01.UP.BLOCK0")){
			return MG_MGBDL5010_CalcCost_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcCost_Ins01.DOWN.BLOCK0")){
			return MG_MGBDL5010_CalcCost_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Chk01.UP.BLOCK0")){
			return MG_MGBDL5010_CalcRsltDel_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Chk01.UP.BLOCK1")){
			return MG_MGBDL5010_CalcRsltDel_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Chk01.DOWN.BLOCK0")){
			return MG_MGBDL5010_CalcRsltDel_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Del01.UP.BLOCK0")){
			return MG_MGBDL5010_CalcRsltDel_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Del01.UP.BLOCK1")){
			return MG_MGBDL5010_CalcRsltDel_Del01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL5010.CalcRsltDel_Del01.DOWN.BLOCK0")){
			return MG_MGBDL5010_CalcRsltDel_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL5010.CalcCost_Ins02.UP.BLOCK0")){
			return MG_MGBDL5010_CalcCost_Ins02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MG_MGBDL5010_CalcCost_Ins01_INFO = new MCOperationInfo("MG", "MGBDL5010", "CalcCost_Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5010_CalcCost_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcCost_Ins01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("carry_flg", "carry_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("data_check_flg", "data_check_flg"),
				MCItemDef.create("itm_limit_flg", "itm_limit_flg")
			}
			,
			MCBlockDef.create("CalcCost_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL5010_CalcCost_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcCost_Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("CalcCost_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL5010_CalcRsltDel_Chk01_INFO = new MCOperationInfo("MG", "MGBDL5010", "CalcRsltDel_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcRsltDel_Dtl")
		);
	}

	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Chk01",
			new MCItemDef[]{
				MCItemDef.create("del_admin_flg", "del_admin_flg")
			}
			,
			MCBlockDef.create("CalcRsltDel_Hdr")
		);
	}


	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Chk01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("CalcRsltDel_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL5010_CalcRsltDel_Del01_INFO = new MCOperationInfo("MG", "MGBDL5010", "CalcRsltDel_Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcRsltDel_Dtl")
		);
	}

	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Del01",
			new MCItemDef[]{
				MCItemDef.create("del_admin_flg", "del_admin_flg")
			}
			,
			MCBlockDef.create("CalcRsltDel_Hdr")
		);
	}


	public static MCContainerDef MG_MGBDL5010_CalcRsltDel_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcRsltDel_Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("CalcRsltDel_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL5010_CalcCost_Ins02_INFO = new MCOperationInfo("MG", "MGBDL5010", "CalcCost_Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL5010_CalcCost_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL5010", "CalcCost_Ins02",
			new MCItemDef[]{
				MCItemDef.create("arg" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("arg" + ".calc_no", "calc_no"),
				MCItemDef.create("arg" + ".st_ym", "st_ym"),
				MCItemDef.create("arg" + ".end_ym", "end_ym"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("sql_no", "sql_no"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_key_cd", "rpt_key_cd"),
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

