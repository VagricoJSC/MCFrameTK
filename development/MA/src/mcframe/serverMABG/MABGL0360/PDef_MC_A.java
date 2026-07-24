package mcframe.serverMABG.MABGL0360;

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
 * [MABGL_CostIoConfigReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0360.CostIoConfig_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfig_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.CostIoConfig_Upd01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfig_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.CostIoConfigLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfigLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.CostIoConfigLcl_Upd01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfigLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.CostIoConfig_DelChk01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfig_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.CostIoConfig_Del01.UP.BLOCK0")){
			return MA_MABGL0360_CostIoConfig_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.Srch01.UP.BLOCK0")){
			return MA_MABGL0360_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0360_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.Srch01.DOWN.BLOCK1")){
			return MA_MABGL0360_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABGL0360.Upd01.UP.BLOCK0")){
			return MA_MABGL0360_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0360.Upd01.UP.BLOCK1")){
			return MA_MABGL0360_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABGL0360.Del01.UP.BLOCK0")){
			return MA_MABGL0360_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfig_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfig_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfig_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfig_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("io_seq", "io_seq"),
				MCItemDef.create("io_tgt_typ", "io_tgt_typ"),
				MCItemDef.create("io_sml_typ", "io_sml_typ"),
				MCItemDef.create("prov_expns_flg", "prov_expns_flg"),
				MCItemDef.create("unit_flg", "unit_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("diff_flg", "diff_flg"),
				MCItemDef.create("bal_calc_typ", "bal_calc_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfig_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfig_Upd01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfig_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfig_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfig_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("io_seq", "io_seq"),
				MCItemDef.create("io_tgt_typ", "io_tgt_typ"),
				MCItemDef.create("io_sml_typ", "io_sml_typ"),
				MCItemDef.create("prov_expns_flg", "prov_expns_flg"),
				MCItemDef.create("unit_flg", "unit_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("diff_flg", "diff_flg"),
				MCItemDef.create("bal_calc_typ", "bal_calc_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfig_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfigLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfigLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfigLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfigLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfigLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfigLcl_Upd01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfigLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfigLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfigLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfigLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfig_DelChk01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfig_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfig_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfig_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfig_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_CostIoConfig_Del01_INFO = new MCOperationInfo("MA", "MABGL0360", "CostIoConfig_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_CostIoConfig_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "CostIoConfig_Del01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CostIoConfig_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_Srch01_INFO = new MCOperationInfo("MA", "MABGL0360", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0360_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("io_col_nm_lcl", "io_col_nm_lcl"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("io_seq", "io_seq"),
				MCItemDef.create("io_tgt_typ", "io_tgt_typ"),
				MCItemDef.create("io_tgt_typ_nm", "io_tgt_typ_nm"),
				MCItemDef.create("io_sml_typ", "io_sml_typ"),
				MCItemDef.create("io_sml_typ_nm", "io_sml_typ_nm"),
				MCItemDef.create("prov_expns_flg", "prov_expns_flg"),
				MCItemDef.create("unit_flg", "unit_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("diff_flg", "diff_flg"),
				MCItemDef.create("bal_calc_typ", "bal_calc_typ"),
				MCItemDef.create("bal_calc_typ_nm", "bal_calc_typ_nm"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABGL0360_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_Upd01_INFO = new MCOperationInfo("MA", "MABGL0360", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("io_seq", "io_seq"),
				MCItemDef.create("io_tgt_typ", "io_tgt_typ"),
				MCItemDef.create("io_sml_typ", "io_sml_typ"),
				MCItemDef.create("prov_expns_flg", "prov_expns_flg"),
				MCItemDef.create("unit_flg", "unit_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("diff_flg", "diff_flg"),
				MCItemDef.create("bal_calc_typ", "bal_calc_typ"),
				MCItemDef.create("minus_flg", "minus_flg"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABGL0360_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABGL0360_Del01_INFO = new MCOperationInfo("MA", "MABGL0360", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0360_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0360", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cost_io_id", "cost_io_id"),
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

