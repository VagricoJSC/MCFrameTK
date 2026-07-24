package mcframe.serverMABG.MABGL0040;

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
 * [MABGL_CalcGrpReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0040.CalcGrp_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.CalcGrp_Upd01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.CalcGrpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.CalcGrpLcl_Upd01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.CalcGrp_DelChk01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.CalcGrp_Del01.UP.BLOCK0")){
			return MA_MABGL0040_CalcGrp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.Srch01.UP.BLOCK0")){
			return MA_MABGL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.Srch01.DOWN.BLOCK1")){
			return MA_MABGL0040_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABGL0040.Upd01.UP.BLOCK0")){
			return MA_MABGL0040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0040.Upd01.UP.BLOCK1")){
			return MA_MABGL0040_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABGL0040.Del01.UP.BLOCK0")){
			return MA_MABGL0040_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABGL0040_CalcGrp_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("cost_calc_typ", "cost_calc_typ"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("max_mons", "max_mons"),
				MCItemDef.create("calc_cnt", "calc_cnt"),
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("exp_calc_typ", "exp_calc_typ"),
				MCItemDef.create("pre_alc_calc_typ", "pre_alc_calc_typ"),
				MCItemDef.create("alc_calc_typ", "alc_calc_typ"),
				MCItemDef.create("inpt_calc_flg", "inpt_calc_flg"),
				MCItemDef.create("wk_calc_flg", "wk_calc_flg"),
				MCItemDef.create("prov_calc_flg", "prov_calc_flg"),
				MCItemDef.create("xfr_calc_flg", "xfr_calc_flg"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("calc_seq_grp", "calc_seq_grp"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("runtime_wg_cd", "runtime_wg_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_CalcGrp_Upd01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("cost_calc_typ", "cost_calc_typ"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("max_mons", "max_mons"),
				MCItemDef.create("calc_cnt", "calc_cnt"),
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("exp_calc_typ", "exp_calc_typ"),
				MCItemDef.create("pre_alc_calc_typ", "pre_alc_calc_typ"),
				MCItemDef.create("alc_calc_typ", "alc_calc_typ"),
				MCItemDef.create("inpt_calc_flg", "inpt_calc_flg"),
				MCItemDef.create("wk_calc_flg", "wk_calc_flg"),
				MCItemDef.create("prov_calc_flg", "prov_calc_flg"),
				MCItemDef.create("xfr_calc_flg", "xfr_calc_flg"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("calc_seq_grp", "calc_seq_grp"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("runtime_wg_cd", "runtime_wg_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_CalcGrpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_CalcGrpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_CalcGrp_DelChk01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_CalcGrp_Del01_INFO = new MCOperationInfo("MA", "MABGL0040", "CalcGrp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_CalcGrp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "CalcGrp_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CalcGrp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_Srch01_INFO = new MCOperationInfo("MA", "MABGL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm_lcl", "calc_grp_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm_lcl", "calc_grp_nm_lcl"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("cost_calc_typ", "cost_calc_typ"),
				MCItemDef.create("cost_calc_typ_nm", "cost_calc_typ_nm"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("eval_typ_nm", "eval_typ_nm"),
				MCItemDef.create("max_mons", "max_mons"),
				MCItemDef.create("calc_cnt", "calc_cnt"),
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("sa_typ_nm", "sa_typ_nm"),
				MCItemDef.create("exp_calc_typ", "exp_calc_typ"),
				MCItemDef.create("exp_calc_typ_nm", "exp_calc_typ_nm"),
				MCItemDef.create("pre_alc_calc_typ", "pre_alc_calc_typ"),
				MCItemDef.create("pre_alc_calc_typ_nm", "pre_alc_calc_typ_nm"),
				MCItemDef.create("alc_calc_typ", "alc_calc_typ"),
				MCItemDef.create("alc_calc_typ_nm", "alc_calc_typ_nm"),
				MCItemDef.create("inpt_calc_flg", "inpt_calc_flg"),
				MCItemDef.create("wk_calc_flg", "wk_calc_flg"),
				MCItemDef.create("prov_calc_flg", "prov_calc_flg"),
				MCItemDef.create("xfr_calc_flg", "xfr_calc_flg"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("calc_seq_grp", "calc_seq_grp"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("runtime_wg_cd", "runtime_wg_cd"),
				MCItemDef.create("runtime_wg_nm", "runtime_wg_nm"),
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
	public static MCContainerDef MA_MABGL0040_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
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
	
	static final MCOperationInfo MA_MABGL0040_Upd01_INFO = new MCOperationInfo("MA", "MABGL0040", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("cost_calc_typ", "cost_calc_typ"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("max_mons", "max_mons"),
				MCItemDef.create("calc_cnt", "calc_cnt"),
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("exp_calc_typ", "exp_calc_typ"),
				MCItemDef.create("pre_alc_calc_typ", "pre_alc_calc_typ"),
				MCItemDef.create("alc_calc_typ", "alc_calc_typ"),
				MCItemDef.create("inpt_calc_flg", "inpt_calc_flg"),
				MCItemDef.create("wk_calc_flg", "wk_calc_flg"),
				MCItemDef.create("prov_calc_flg", "prov_calc_flg"),
				MCItemDef.create("xfr_calc_flg", "xfr_calc_flg"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("calc_seq_grp", "calc_seq_grp"),
				MCItemDef.create("calc_seq", "calc_seq"),
				MCItemDef.create("runtime_wg_cd", "runtime_wg_cd"),
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

	public static MCContainerDef MA_MABGL0040_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABGL0040_Del01_INFO = new MCOperationInfo("MA", "MABGL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0040_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

