package mcframe.serverMABS.MABSL0110;

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
 * [MABSL_OperWkCostReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0110.OperWkCost_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0110_OperWkCost_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.OperWkCost_Upd01.UP.BLOCK0")){
			return MA_MABSL0110_OperWkCost_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.OperWkCost_DelChk01.UP.BLOCK0")){
			return MA_MABSL0110_OperWkCost_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.OperWkCost_Del01.UP.BLOCK0")){
			return MA_MABSL0110_OperWkCost_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Srch01.UP.BLOCK0")){
			return MA_MABSL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Sprt01.UP.BLOCK0")){
			return MA_MABSL0110_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0110_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Upd01.UP.BLOCK0")){
			return MA_MABSL0110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0110.Del01.UP.BLOCK0")){
			return MA_MABSL0110_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABSL0110_OperWkCost_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0110", "OperWkCost_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_OperWkCost_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "OperWkCost_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperWkCost_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_OperWkCost_Upd01_INFO = new MCOperationInfo("MA", "MABSL0110", "OperWkCost_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_OperWkCost_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "OperWkCost_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperWkCost_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_OperWkCost_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0110", "OperWkCost_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_OperWkCost_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "OperWkCost_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperWkCost_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_OperWkCost_Del01_INFO = new MCOperationInfo("MA", "MABSL0110", "OperWkCost_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_OperWkCost_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "OperWkCost_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("OperWkCost_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_Srch01_INFO = new MCOperationInfo("MA", "MABSL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("nullval_wg_cd", "nullval_wg_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0110_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_unit_dec_place", "wk_cost_unit_dec_place"),
				MCItemDef.create("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("itm_dec_place", "itm_dec_place"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0110", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_unit_dec_place", "wk_cost_unit_dec_place"),
				MCItemDef.create("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("itm_dec_place", "itm_dec_place"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0110_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_unit_dec_place", "wk_cost_unit_dec_place"),
				MCItemDef.create("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("itm_dec_place", "itm_dec_place"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_Upd01_INFO = new MCOperationInfo("MA", "MABSL0110", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0110_Del01_INFO = new MCOperationInfo("MA", "MABSL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0110_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

